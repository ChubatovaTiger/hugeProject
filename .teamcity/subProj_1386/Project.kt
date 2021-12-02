package subProj_1386

import subProj_1386.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1386")
    name = "subProj 1386"

    buildType(subProj_bt_1386_2)
    buildType(subProj_bt_1386_3)
    buildType(subProj_bt_1386_4)
    buildType(subProj_bt_1386_5)
    buildType(subProj_bt_1386_0)
    buildType(subProj_bt_1386_1)
})
