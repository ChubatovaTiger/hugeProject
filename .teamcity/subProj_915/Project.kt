package subProj_915

import subProj_915.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_915")
    name = "subProj 915"

    buildType(subProj_bt_915_5)
    buildType(subProj_bt_915_4)
    buildType(subProj_bt_915_3)
    buildType(subProj_bt_915_2)
    buildType(subProj_bt_915_1)
    buildType(subProj_bt_915_0)
})
