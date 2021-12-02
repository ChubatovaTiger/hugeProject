package subProj_1699

import subProj_1699.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1699")
    name = "subProj 1699"

    buildType(subProj_bt_1699_5)
    buildType(subProj_bt_1699_0)
    buildType(subProj_bt_1699_4)
    buildType(subProj_bt_1699_3)
    buildType(subProj_bt_1699_2)
    buildType(subProj_bt_1699_1)
})
