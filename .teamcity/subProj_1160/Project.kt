package subProj_1160

import subProj_1160.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1160")
    name = "subProj 1160"

    buildType(subProj_bt_1160_3)
    buildType(subProj_bt_1160_2)
    buildType(subProj_bt_1160_1)
    buildType(subProj_bt_1160_0)
    buildType(subProj_bt_1160_5)
    buildType(subProj_bt_1160_4)
})
