package subProj_1505

import subProj_1505.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1505")
    name = "subProj 1505"

    buildType(subProj_bt_1505_2)
    buildType(subProj_bt_1505_1)
    buildType(subProj_bt_1505_4)
    buildType(subProj_bt_1505_3)
    buildType(subProj_bt_1505_5)
    buildType(subProj_bt_1505_0)
})
