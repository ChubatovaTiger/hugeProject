package subProj_322

import subProj_322.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_322")
    name = "subProj 322"

    buildType(subProj_bt_322_4)
    buildType(subProj_bt_322_3)
    buildType(subProj_bt_322_2)
    buildType(subProj_bt_322_1)
    buildType(subProj_bt_322_5)
    buildType(subProj_bt_322_0)
})
