package subProj_658

import subProj_658.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_658")
    name = "subProj 658"

    buildType(subProj_bt_658_5)
    buildType(subProj_bt_658_3)
    buildType(subProj_bt_658_4)
    buildType(subProj_bt_658_1)
    buildType(subProj_bt_658_2)
    buildType(subProj_bt_658_0)
})
