package subProj_1302

import subProj_1302.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1302")
    name = "subProj 1302"

    buildType(subProj_bt_1302_3)
    buildType(subProj_bt_1302_2)
    buildType(subProj_bt_1302_5)
    buildType(subProj_bt_1302_4)
    buildType(subProj_bt_1302_1)
    buildType(subProj_bt_1302_0)
})
