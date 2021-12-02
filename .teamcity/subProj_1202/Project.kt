package subProj_1202

import subProj_1202.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1202")
    name = "subProj 1202"

    buildType(subProj_bt_1202_5)
    buildType(subProj_bt_1202_4)
    buildType(subProj_bt_1202_3)
    buildType(subProj_bt_1202_2)
    buildType(subProj_bt_1202_1)
    buildType(subProj_bt_1202_0)
})
