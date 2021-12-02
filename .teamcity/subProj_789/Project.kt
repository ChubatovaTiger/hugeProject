package subProj_789

import subProj_789.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_789")
    name = "subProj 789"

    buildType(subProj_bt_789_4)
    buildType(subProj_bt_789_5)
    buildType(subProj_bt_789_2)
    buildType(subProj_bt_789_3)
    buildType(subProj_bt_789_0)
    buildType(subProj_bt_789_1)
})
