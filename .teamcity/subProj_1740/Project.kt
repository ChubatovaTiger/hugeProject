package subProj_1740

import subProj_1740.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1740")
    name = "subProj 1740"

    buildType(subProj_bt_1740_5)
    buildType(subProj_bt_1740_4)
    buildType(subProj_bt_1740_3)
    buildType(subProj_bt_1740_2)
    buildType(subProj_bt_1740_1)
    buildType(subProj_bt_1740_0)
})
