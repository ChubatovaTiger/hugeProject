package subProj_911

import subProj_911.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_911")
    name = "subProj 911"

    buildType(subProj_bt_911_2)
    buildType(subProj_bt_911_1)
    buildType(subProj_bt_911_0)
    buildType(subProj_bt_911_5)
    buildType(subProj_bt_911_4)
    buildType(subProj_bt_911_3)
})
