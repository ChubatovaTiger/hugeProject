package subProj_1546

import subProj_1546.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1546")
    name = "subProj 1546"

    buildType(subProj_bt_1546_5)
    buildType(subProj_bt_1546_4)
    buildType(subProj_bt_1546_3)
    buildType(subProj_bt_1546_2)
    buildType(subProj_bt_1546_1)
    buildType(subProj_bt_1546_0)
})
