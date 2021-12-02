package subProj_1463

import subProj_1463.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1463")
    name = "subProj 1463"

    buildType(subProj_bt_1463_0)
    buildType(subProj_bt_1463_1)
    buildType(subProj_bt_1463_4)
    buildType(subProj_bt_1463_5)
    buildType(subProj_bt_1463_2)
    buildType(subProj_bt_1463_3)
})
