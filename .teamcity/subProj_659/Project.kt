package subProj_659

import subProj_659.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_659")
    name = "subProj 659"

    buildType(subProj_bt_659_4)
    buildType(subProj_bt_659_5)
    buildType(subProj_bt_659_2)
    buildType(subProj_bt_659_3)
    buildType(subProj_bt_659_0)
    buildType(subProj_bt_659_1)
})
