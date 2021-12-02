package subProj_202

import subProj_202.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_202")
    name = "subProj 202"

    buildType(subProj_bt_202_4)
    buildType(subProj_bt_202_5)
    buildType(subProj_bt_202_0)
    buildType(subProj_bt_202_1)
    buildType(subProj_bt_202_2)
    buildType(subProj_bt_202_3)
})
