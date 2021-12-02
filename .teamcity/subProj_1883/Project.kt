package subProj_1883

import subProj_1883.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1883")
    name = "subProj 1883"

    buildType(subProj_bt_1883_5)
    buildType(subProj_bt_1883_4)
    buildType(subProj_bt_1883_3)
    buildType(subProj_bt_1883_2)
    buildType(subProj_bt_1883_1)
    buildType(subProj_bt_1883_0)
})
