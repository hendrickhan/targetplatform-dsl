/**
 */
package fr.obeo.releng.targetplatform.impl;

import com.google.common.base.Objects;
import com.google.common.base.Splitter;

import com.google.common.collect.Iterables;

import fr.obeo.releng.targetplatform.Environment;
import fr.obeo.releng.targetplatform.TargetContent;
import fr.obeo.releng.targetplatform.TargetPlatform;
import fr.obeo.releng.targetplatform.TargetPlatformPackage;

import java.lang.Iterable;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import org.eclipse.core.runtime.Platform;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.jdt.launching.JavaRuntime;

import org.eclipse.jdt.launching.environments.IExecutionEnvironment;
import org.eclipse.jdt.launching.environments.IExecutionEnvironmentsManager;

import org.eclipse.xtext.xbase.lib.Functions.Function1;

import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.obeo.releng.targetplatform.impl.EnvironmentImpl#getEnv <em>Env</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.impl.EnvironmentImpl#getOperatingSystem <em>Operating System</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.impl.EnvironmentImpl#getWindowingSystem <em>Windowing System</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.impl.EnvironmentImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.impl.EnvironmentImpl#getLocalization <em>Localization</em>}</li>
 *   <li>{@link fr.obeo.releng.targetplatform.impl.EnvironmentImpl#getExecutionEnvironment <em>Execution Environment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnvironmentImpl extends MinimalEObjectImpl.Container implements Environment {
	/**
	 * The cached value of the '{@link #getEnv() <em>Env</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnv()
	 * @generated
	 * @ordered
	 */
	protected EList<String> env;

	/**
	 * The default value of the '{@link #getOperatingSystem() <em>Operating System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATING_SYSTEM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getWindowingSystem() <em>Windowing System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindowingSystem()
	 * @generated
	 * @ordered
	 */
	protected static final String WINDOWING_SYSTEM_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCHITECTURE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLocalization() <em>Localization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalization()
	 * @generated
	 * @ordered
	 */
	protected static final Locale LOCALIZATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getExecutionEnvironment() <em>Execution Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionEnvironment()
	 * @generated
	 * @ordered
	 */
	protected static final IExecutionEnvironment EXECUTION_ENVIRONMENT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPlatformPackage.Literals.ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEnv() {
		if (env == null) {
			env = new EDataTypeEList<String>(String.class, this, TargetPlatformPackage.ENVIRONMENT__ENV);
		}
		return env;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperatingSystem() {
		EObject _eContainer = this.eContainer();
		EList<TargetContent> _contents = ((TargetPlatform) _eContainer).getContents();
		Iterable<Environment> _filter = Iterables.<Environment>filter(_contents, Environment.class);
		final Function1<Environment, EList<String>> _function = new Function1<Environment, EList<String>>() {
			public EList<String> apply(final Environment it) {
				return it.getEnv();
			}
		};
		Iterable<EList<String>> _map = IterableExtensions.<Environment, EList<String>>map(_filter, _function);
		Iterable<String> _flatten = Iterables.<String>concat(_map);
		final Function1<String, Boolean> _function_1 = new Function1<String, Boolean>() {
			public Boolean apply(final String it) {
				boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(it);
				return Boolean.valueOf((!_isNullOrEmpty));
			}
		};
		Iterable<String> _filter_1 = IterableExtensions.<String>filter(_flatten, _function_1);
		final Function1<String, String> _function_2 = new Function1<String, String>() {
			public String apply(final String it) {
				return it.toUpperCase();
			}
		};
		Iterable<String> _map_1 = IterableExtensions.<String, String>map(_filter_1, _function_2);
		final List<String> envToUpper = IterableExtensions.<String>toList(_map_1);
		String[] _knownOSValues = Platform.knownOSValues();
		final Function1<String, Boolean> _function_3 = new Function1<String, Boolean>() {
			public Boolean apply(final String it) {
				String _upperCase = it.toUpperCase();
				return Boolean.valueOf(envToUpper.contains(_upperCase));
			}
		};
		return IterableExtensions.<String>findFirst(((Iterable<String>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_knownOSValues)), _function_3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWindowingSystem() {
		EObject _eContainer = this.eContainer();
		EList<TargetContent> _contents = ((TargetPlatform) _eContainer).getContents();
		Iterable<Environment> _filter = Iterables.<Environment>filter(_contents, Environment.class);
		final Function1<Environment, EList<String>> _function = new Function1<Environment, EList<String>>() {
			public EList<String> apply(final Environment it) {
				return it.getEnv();
			}
		};
		Iterable<EList<String>> _map = IterableExtensions.<Environment, EList<String>>map(_filter, _function);
		Iterable<String> _flatten = Iterables.<String>concat(_map);
		final Function1<String, Boolean> _function_1 = new Function1<String, Boolean>() {
			public Boolean apply(final String it) {
				boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(it);
				return Boolean.valueOf((!_isNullOrEmpty));
			}
		};
		Iterable<String> _filter_1 = IterableExtensions.<String>filter(_flatten, _function_1);
		final Function1<String, String> _function_2 = new Function1<String, String>() {
			public String apply(final String it) {
				return it.toUpperCase();
			}
		};
		Iterable<String> _map_1 = IterableExtensions.<String, String>map(_filter_1, _function_2);
		final List<String> envToUpper = IterableExtensions.<String>toList(_map_1);
		String[] _knownWSValues = Platform.knownWSValues();
		final Function1<String, String> _function_3 = new Function1<String, String>() {
			public String apply(final String it) {
				return it.toUpperCase();
			}
		};
		final List<String> knownWSUpperValues = ListExtensions.<String, String>map(((List<String>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_knownWSValues)), _function_3);
		final Function1<String, Boolean> _function_4 = new Function1<String, Boolean>() {
			public Boolean apply(final String it) {
				return Boolean.valueOf(knownWSUpperValues.contains(it));
			}
		};
		Iterable<String> _filter_2 = IterableExtensions.<String>filter(envToUpper, _function_4);
		final List<String> allWS = IterableExtensions.<String>toList(_filter_2);
		boolean _and = false;
		int _size = allWS.size();
		boolean _lessEqualsThan = (_size <= 1);
		if (!_lessEqualsThan) {
			_and = false;
		} else {
			String _operatingSystem = this.getOperatingSystem();
			String _upperCase = null;
			if (_operatingSystem!=null) {
				_upperCase=_operatingSystem.toUpperCase();
			}
			boolean _contains = allWS.contains(_upperCase);
			_and = _contains;
		}
		if (_and) {
			return null;
		}
		else {
			String[] _knownWSValues_1 = Platform.knownWSValues();
			final Function1<String, Boolean> _function_5 = new Function1<String, Boolean>() {
				public Boolean apply(final String it) {
					String _upperCase = it.toUpperCase();
					return Boolean.valueOf(envToUpper.contains(_upperCase));
				}
			};
			return IterableExtensions.<String>findFirst(((Iterable<String>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_knownWSValues_1)), _function_5);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArchitecture() {
		EObject _eContainer = this.eContainer();
		EList<TargetContent> _contents = ((TargetPlatform) _eContainer).getContents();
		Iterable<Environment> _filter = Iterables.<Environment>filter(_contents, Environment.class);
		final Function1<Environment, EList<String>> _function = new Function1<Environment, EList<String>>() {
			public EList<String> apply(final Environment it) {
				return it.getEnv();
			}
		};
		Iterable<EList<String>> _map = IterableExtensions.<Environment, EList<String>>map(_filter, _function);
		Iterable<String> _flatten = Iterables.<String>concat(_map);
		final Function1<String, Boolean> _function_1 = new Function1<String, Boolean>() {
			public Boolean apply(final String it) {
				boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(it);
				return Boolean.valueOf((!_isNullOrEmpty));
			}
		};
		Iterable<String> _filter_1 = IterableExtensions.<String>filter(_flatten, _function_1);
		final Function1<String, String> _function_2 = new Function1<String, String>() {
			public String apply(final String it) {
				return it.toUpperCase();
			}
		};
		Iterable<String> _map_1 = IterableExtensions.<String, String>map(_filter_1, _function_2);
		final List<String> envToUpper = IterableExtensions.<String>toList(_map_1);
		String[] _knownOSArchValues = Platform.knownOSArchValues();
		final Function1<String, Boolean> _function_3 = new Function1<String, Boolean>() {
			public Boolean apply(final String it) {
				String _upperCase = it.toUpperCase();
				return Boolean.valueOf(envToUpper.contains(_upperCase));
			}
		};
		return IterableExtensions.<String>findFirst(((Iterable<String>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_knownOSArchValues)), _function_3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Locale getLocalization() {
		EObject _eContainer = this.eContainer();
		EList<TargetContent> _contents = ((TargetPlatform) _eContainer).getContents();
		Iterable<Environment> _filter = Iterables.<Environment>filter(_contents, Environment.class);
		final Function1<Environment, EList<String>> _function = new Function1<Environment, EList<String>>() {
			public EList<String> apply(final Environment it) {
				return it.getEnv();
			}
		};
		Iterable<EList<String>> _map = IterableExtensions.<Environment, EList<String>>map(_filter, _function);
		Iterable<String> _flatten = Iterables.<String>concat(_map);
		final Function1<String, Boolean> _function_1 = new Function1<String, Boolean>() {
			public Boolean apply(final String it) {
				boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(it);
				return Boolean.valueOf((!_isNullOrEmpty));
			}
		};
		Iterable<String> _filter_1 = IterableExtensions.<String>filter(_flatten, _function_1);
		final Function1<String, String> _function_2 = new Function1<String, String>() {
			public String apply(final String it) {
				return it.toUpperCase();
			}
		};
		Iterable<String> _map_1 = IterableExtensions.<String, String>map(_filter_1, _function_2);
		final List<String> envToUpper = IterableExtensions.<String>toList(_map_1);
		Locale[] _availableLocales = Locale.getAvailableLocales();
		final Function1<Locale, String> _function_3 = new Function1<Locale, String>() {
			public String apply(final Locale it) {
				return it.toString();
			}
		};
		List<String> _map_2 = ListExtensions.<Locale, String>map(((List<Locale>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_availableLocales)), _function_3);
		final Function1<String, Boolean> _function_4 = new Function1<String, Boolean>() {
			public Boolean apply(final String it) {
				String _upperCase = it.toUpperCase();
				return Boolean.valueOf(envToUpper.contains(_upperCase));
			}
		};
		final String locale = IterableExtensions.<String>findFirst(_map_2, _function_4);
		boolean _notEquals = (!Objects.equal(locale, null));
		if (_notEquals) {
			String language = "";
			String country = "";
			String variant = "";
			Splitter _on = Splitter.on("_");
			Splitter _trimResults = _on.trimResults();
			Iterable<String> _split = _trimResults.split(locale);
			final Iterator<String> tokens = _split.iterator();
			boolean _hasNext = tokens.hasNext();
			if (_hasNext) {
				String _next = tokens.next();
				language = _next;
			}
			boolean _hasNext_1 = tokens.hasNext();
			if (_hasNext_1) {
				String _next_1 = tokens.next();
				country = _next_1;
			}
			boolean _hasNext_2 = tokens.hasNext();
			if (_hasNext_2) {
				String _next_2 = tokens.next();
				variant = _next_2;
			}
			return new Locale(language, country, variant);
		}
		else {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IExecutionEnvironment getExecutionEnvironment() {
		final IExecutionEnvironmentsManager eeManager = JavaRuntime.getExecutionEnvironmentsManager();
		boolean _notEquals = (!Objects.equal(eeManager, null));
		if (_notEquals) {
			EObject _eContainer = this.eContainer();
			EList<TargetContent> _contents = ((TargetPlatform) _eContainer).getContents();
			Iterable<Environment> _filter = Iterables.<Environment>filter(_contents, Environment.class);
			final Function1<Environment, EList<String>> _function = new Function1<Environment, EList<String>>() {
				public EList<String> apply(final Environment it) {
					return it.getEnv();
				}
			};
			Iterable<EList<String>> _map = IterableExtensions.<Environment, EList<String>>map(_filter, _function);
			Iterable<String> _flatten = Iterables.<String>concat(_map);
			final Function1<String, Boolean> _function_1 = new Function1<String, Boolean>() {
				public Boolean apply(final String it) {
					boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(it);
					return Boolean.valueOf((!_isNullOrEmpty));
				}
			};
			Iterable<String> _filter_1 = IterableExtensions.<String>filter(_flatten, _function_1);
			final Function1<String, String> _function_2 = new Function1<String, String>() {
				public String apply(final String it) {
					return it.toUpperCase();
				}
			};
			Iterable<String> _map_1 = IterableExtensions.<String, String>map(_filter_1, _function_2);
			final List<String> envToUpper = IterableExtensions.<String>toList(_map_1);
			for (final String env : envToUpper) {
				{
					IExecutionEnvironment[] _executionEnvironments = eeManager.getExecutionEnvironments();
					final Function1<IExecutionEnvironment, Boolean> _function_3 = new Function1<IExecutionEnvironment, Boolean>() {
						public Boolean apply(final IExecutionEnvironment it) {
							String _id = it.getId();
							String _upperCase = _id.toUpperCase();
							return Boolean.valueOf(_upperCase.equals(env));
						}
					};
					final IExecutionEnvironment ee = IterableExtensions.<IExecutionEnvironment>findFirst(((Iterable<IExecutionEnvironment>)org.eclipse.xtext.xbase.lib.Conversions.doWrapArray(_executionEnvironments)), _function_3);
					boolean _notEquals_1 = (!Objects.equal(ee, null));
					if (_notEquals_1) {
						return ee;
					}
				}
			}
			return null;
		}
		else {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TargetPlatformPackage.ENVIRONMENT__ENV:
				return getEnv();
			case TargetPlatformPackage.ENVIRONMENT__OPERATING_SYSTEM:
				return getOperatingSystem();
			case TargetPlatformPackage.ENVIRONMENT__WINDOWING_SYSTEM:
				return getWindowingSystem();
			case TargetPlatformPackage.ENVIRONMENT__ARCHITECTURE:
				return getArchitecture();
			case TargetPlatformPackage.ENVIRONMENT__LOCALIZATION:
				return getLocalization();
			case TargetPlatformPackage.ENVIRONMENT__EXECUTION_ENVIRONMENT:
				return getExecutionEnvironment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TargetPlatformPackage.ENVIRONMENT__ENV:
				getEnv().clear();
				getEnv().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TargetPlatformPackage.ENVIRONMENT__ENV:
				getEnv().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TargetPlatformPackage.ENVIRONMENT__ENV:
				return env != null && !env.isEmpty();
			case TargetPlatformPackage.ENVIRONMENT__OPERATING_SYSTEM:
				return OPERATING_SYSTEM_EDEFAULT == null ? getOperatingSystem() != null : !OPERATING_SYSTEM_EDEFAULT.equals(getOperatingSystem());
			case TargetPlatformPackage.ENVIRONMENT__WINDOWING_SYSTEM:
				return WINDOWING_SYSTEM_EDEFAULT == null ? getWindowingSystem() != null : !WINDOWING_SYSTEM_EDEFAULT.equals(getWindowingSystem());
			case TargetPlatformPackage.ENVIRONMENT__ARCHITECTURE:
				return ARCHITECTURE_EDEFAULT == null ? getArchitecture() != null : !ARCHITECTURE_EDEFAULT.equals(getArchitecture());
			case TargetPlatformPackage.ENVIRONMENT__LOCALIZATION:
				return LOCALIZATION_EDEFAULT == null ? getLocalization() != null : !LOCALIZATION_EDEFAULT.equals(getLocalization());
			case TargetPlatformPackage.ENVIRONMENT__EXECUTION_ENVIRONMENT:
				return EXECUTION_ENVIRONMENT_EDEFAULT == null ? getExecutionEnvironment() != null : !EXECUTION_ENVIRONMENT_EDEFAULT.equals(getExecutionEnvironment());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (env: ");
		result.append(env);
		result.append(')');
		return result.toString();
	}

} //EnvironmentImpl
