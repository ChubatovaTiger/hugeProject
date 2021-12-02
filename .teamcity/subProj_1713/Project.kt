package subProj_1713

import subProj_1713.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1713")
    name = "subProj 1713"

    buildType(subProj_bt_1713_0)
    buildType(subProj_bt_1713_1)
    buildType(subProj_bt_1713_4)
    buildType(subProj_bt_1713_5)
    buildType(subProj_bt_1713_2)
    buildType(subProj_bt_1713_3)
})
