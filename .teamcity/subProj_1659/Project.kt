package subProj_1659

import subProj_1659.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1659")
    name = "subProj 1659"

    buildType(subProj_bt_1659_2)
    buildType(subProj_bt_1659_1)
    buildType(subProj_bt_1659_4)
    buildType(subProj_bt_1659_3)
    buildType(subProj_bt_1659_5)
    buildType(subProj_bt_1659_0)
})
