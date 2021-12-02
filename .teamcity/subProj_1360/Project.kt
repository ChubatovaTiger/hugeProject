package subProj_1360

import subProj_1360.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1360")
    name = "subProj 1360"

    buildType(subProj_bt_1360_5)
    buildType(subProj_bt_1360_4)
    buildType(subProj_bt_1360_3)
    buildType(subProj_bt_1360_2)
    buildType(subProj_bt_1360_1)
    buildType(subProj_bt_1360_0)
})
