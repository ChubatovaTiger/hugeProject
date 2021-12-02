package subProj_1423

import subProj_1423.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1423")
    name = "subProj 1423"

    buildType(subProj_bt_1423_2)
    buildType(subProj_bt_1423_3)
    buildType(subProj_bt_1423_4)
    buildType(subProj_bt_1423_5)
    buildType(subProj_bt_1423_0)
    buildType(subProj_bt_1423_1)
})
