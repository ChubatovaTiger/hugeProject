package subProj_1930

import subProj_1930.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1930")
    name = "subProj 1930"

    buildType(subProj_bt_1930_0)
    buildType(subProj_bt_1930_4)
    buildType(subProj_bt_1930_3)
    buildType(subProj_bt_1930_2)
    buildType(subProj_bt_1930_1)
    buildType(subProj_bt_1930_5)
})
