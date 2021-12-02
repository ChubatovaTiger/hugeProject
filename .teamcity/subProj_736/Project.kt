package subProj_736

import subProj_736.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_736")
    name = "subProj 736"

    buildType(subProj_bt_736_2)
    buildType(subProj_bt_736_3)
    buildType(subProj_bt_736_4)
    buildType(subProj_bt_736_5)
    buildType(subProj_bt_736_0)
    buildType(subProj_bt_736_1)
})
