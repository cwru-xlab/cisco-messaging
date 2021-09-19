# Change Log

## __0.1.4__

### New Features

- None

### Enhancements

- Remove redundant "cirrus" from `artifactId`.

### Bug Fixes

- None

## __0.1.3__

### New Features

- None

### Enhancements

- None

### Bug Fixes

- Remove `*.jar` from `.gitignore` and add `gradle-wrapper.jar`.

## __0.1.2__

### New Features

- None

### Enhancements

- Add Gradle wrapper validation to the `gradle-publish` workflow.

### Bug Fixes

- Rename group `org.cirrus` from `org.cirrus.messaging.core`.
- Explicitly specify `groupId`, `artifactId`, and `version` in `publications` section
  of `build.gradle`.

## __0.1.1__

### New Features

- None

### Enhancements

- None

### Bug Fixes

- Replace `username` and `variable` environment variables in `build.gradle`. No package was produced
  from release 0.1.0 which may have been caused by incorrect environment variables.

## __0.1.0__

### New Features

- Initial release

### Enhancements

- None

### Bug Fixes

- None