package subProj_1273

import subProj_1273.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1273")
    name = "subProj 1273"

    buildType(subProj_bt_1273_5)
    buildType(subProj_bt_1273_0)
    buildType(subProj_bt_1273_3)
    buildType(subProj_bt_1273_4)
    buildType(subProj_bt_1273_1)
    buildType(subProj_bt_1273_2)
})
