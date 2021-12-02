package subProj_501

import subProj_501.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_501")
    name = "subProj 501"

    buildType(subProj_bt_501_4)
    buildType(subProj_bt_501_5)
    buildType(subProj_bt_501_2)
    buildType(subProj_bt_501_3)
    buildType(subProj_bt_501_0)
    buildType(subProj_bt_501_1)
})
