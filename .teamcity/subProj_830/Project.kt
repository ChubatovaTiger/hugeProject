package subProj_830

import subProj_830.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_830")
    name = "subProj 830"

    buildType(subProj_bt_830_1)
    buildType(subProj_bt_830_2)
    buildType(subProj_bt_830_0)
    buildType(subProj_bt_830_5)
    buildType(subProj_bt_830_3)
    buildType(subProj_bt_830_4)
})
