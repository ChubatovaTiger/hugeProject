package subProj_1880

import subProj_1880.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1880")
    name = "subProj 1880"

    buildType(subProj_bt_1880_5)
    buildType(subProj_bt_1880_4)
    buildType(subProj_bt_1880_3)
    buildType(subProj_bt_1880_2)
    buildType(subProj_bt_1880_1)
    buildType(subProj_bt_1880_0)
})
