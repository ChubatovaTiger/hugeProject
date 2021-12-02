package subProj_618

import subProj_618.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_618")
    name = "subProj 618"

    buildType(subProj_bt_618_4)
    buildType(subProj_bt_618_3)
    buildType(subProj_bt_618_5)
    buildType(subProj_bt_618_0)
    buildType(subProj_bt_618_2)
    buildType(subProj_bt_618_1)
})
