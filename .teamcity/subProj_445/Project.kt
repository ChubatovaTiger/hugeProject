package subProj_445

import subProj_445.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_445")
    name = "subProj 445"

    buildType(subProj_bt_445_1)
    buildType(subProj_bt_445_2)
    buildType(subProj_bt_445_0)
    buildType(subProj_bt_445_5)
    buildType(subProj_bt_445_3)
    buildType(subProj_bt_445_4)
})
