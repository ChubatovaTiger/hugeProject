package subProj_160

import subProj_160.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_160")
    name = "subProj 160"

    buildType(subProj_bt_160_1)
    buildType(subProj_bt_160_2)
    buildType(subProj_bt_160_3)
    buildType(subProj_bt_160_4)
    buildType(subProj_bt_160_5)
    buildType(subProj_bt_160_0)
})
