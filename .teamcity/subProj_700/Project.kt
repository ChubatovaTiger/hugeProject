package subProj_700

import subProj_700.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_700")
    name = "subProj 700"

    buildType(subProj_bt_700_5)
    buildType(subProj_bt_700_0)
    buildType(subProj_bt_700_3)
    buildType(subProj_bt_700_4)
    buildType(subProj_bt_700_1)
    buildType(subProj_bt_700_2)
})
