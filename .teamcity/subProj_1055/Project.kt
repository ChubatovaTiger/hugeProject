package subProj_1055

import subProj_1055.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1055")
    name = "subProj 1055"

    buildType(subProj_bt_1055_4)
    buildType(subProj_bt_1055_3)
    buildType(subProj_bt_1055_5)
    buildType(subProj_bt_1055_0)
    buildType(subProj_bt_1055_2)
    buildType(subProj_bt_1055_1)
})
