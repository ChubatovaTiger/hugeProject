package subProj_1227

import subProj_1227.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1227")
    name = "subProj 1227"

    buildType(subProj_bt_1227_0)
    buildType(subProj_bt_1227_1)
    buildType(subProj_bt_1227_2)
    buildType(subProj_bt_1227_3)
    buildType(subProj_bt_1227_4)
    buildType(subProj_bt_1227_5)
})
