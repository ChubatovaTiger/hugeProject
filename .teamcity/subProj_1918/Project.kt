package subProj_1918

import subProj_1918.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1918")
    name = "subProj 1918"

    buildType(subProj_bt_1918_5)
    buildType(subProj_bt_1918_3)
    buildType(subProj_bt_1918_4)
    buildType(subProj_bt_1918_1)
    buildType(subProj_bt_1918_2)
    buildType(subProj_bt_1918_0)
})
