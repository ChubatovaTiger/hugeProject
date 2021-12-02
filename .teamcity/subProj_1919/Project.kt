package subProj_1919

import subProj_1919.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1919")
    name = "subProj 1919"

    buildType(subProj_bt_1919_4)
    buildType(subProj_bt_1919_5)
    buildType(subProj_bt_1919_2)
    buildType(subProj_bt_1919_3)
    buildType(subProj_bt_1919_0)
    buildType(subProj_bt_1919_1)
})
