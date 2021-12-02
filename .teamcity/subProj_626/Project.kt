package subProj_626

import subProj_626.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_626")
    name = "subProj 626"

    buildType(subProj_bt_626_3)
    buildType(subProj_bt_626_2)
    buildType(subProj_bt_626_5)
    buildType(subProj_bt_626_4)
    buildType(subProj_bt_626_1)
    buildType(subProj_bt_626_0)
})
