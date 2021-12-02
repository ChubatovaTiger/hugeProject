package subProj_733

import subProj_733.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_733")
    name = "subProj 733"

    buildType(subProj_bt_733_5)
    buildType(subProj_bt_733_1)
    buildType(subProj_bt_733_2)
    buildType(subProj_bt_733_3)
    buildType(subProj_bt_733_4)
    buildType(subProj_bt_733_0)
})
