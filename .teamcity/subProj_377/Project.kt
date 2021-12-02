package subProj_377

import subProj_377.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_377")
    name = "subProj 377"

    buildType(subProj_bt_377_5)
    buildType(subProj_bt_377_2)
    buildType(subProj_bt_377_1)
    buildType(subProj_bt_377_4)
    buildType(subProj_bt_377_3)
    buildType(subProj_bt_377_0)
})
