package subProj_273

import subProj_273.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_273")
    name = "subProj 273"

    buildType(subProj_bt_273_5)
    buildType(subProj_bt_273_4)
    buildType(subProj_bt_273_3)
    buildType(subProj_bt_273_2)
    buildType(subProj_bt_273_1)
    buildType(subProj_bt_273_0)
})
