package subProj_740

import subProj_740.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_740")
    name = "subProj 740"

    buildType(subProj_bt_740_0)
    buildType(subProj_bt_740_5)
    buildType(subProj_bt_740_1)
    buildType(subProj_bt_740_2)
    buildType(subProj_bt_740_3)
    buildType(subProj_bt_740_4)
})
