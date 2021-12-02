package subProj_632

import subProj_632.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_632")
    name = "subProj 632"

    buildType(subProj_bt_632_4)
    buildType(subProj_bt_632_3)
    buildType(subProj_bt_632_5)
    buildType(subProj_bt_632_0)
    buildType(subProj_bt_632_2)
    buildType(subProj_bt_632_1)
})
