package subProj_1298

import subProj_1298.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1298")
    name = "subProj 1298"

    buildType(subProj_bt_1298_5)
    buildType(subProj_bt_1298_4)
    buildType(subProj_bt_1298_3)
    buildType(subProj_bt_1298_2)
    buildType(subProj_bt_1298_1)
    buildType(subProj_bt_1298_0)
})
