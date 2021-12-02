package subProj_1168

import subProj_1168.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1168")
    name = "subProj 1168"

    buildType(subProj_bt_1168_3)
    buildType(subProj_bt_1168_2)
    buildType(subProj_bt_1168_1)
    buildType(subProj_bt_1168_0)
    buildType(subProj_bt_1168_5)
    buildType(subProj_bt_1168_4)
})
