package subProj_66

import subProj_66.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_66")
    name = "subProj 66"

    buildType(subProj_bt_66_0)
    buildType(subProj_bt_66_1)
    buildType(subProj_bt_66_4)
    buildType(subProj_bt_66_5)
    buildType(subProj_bt_66_2)
    buildType(subProj_bt_66_3)
})
