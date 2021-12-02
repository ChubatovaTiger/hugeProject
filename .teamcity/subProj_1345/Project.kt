package subProj_1345

import subProj_1345.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1345")
    name = "subProj 1345"

    buildType(subProj_bt_1345_5)
    buildType(subProj_bt_1345_4)
    buildType(subProj_bt_1345_3)
    buildType(subProj_bt_1345_2)
    buildType(subProj_bt_1345_1)
    buildType(subProj_bt_1345_0)
})
