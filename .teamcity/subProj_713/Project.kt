package subProj_713

import subProj_713.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_713")
    name = "subProj 713"

    buildType(subProj_bt_713_5)
    buildType(subProj_bt_713_4)
    buildType(subProj_bt_713_3)
    buildType(subProj_bt_713_2)
    buildType(subProj_bt_713_1)
    buildType(subProj_bt_713_0)
})
