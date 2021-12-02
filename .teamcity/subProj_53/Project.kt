package subProj_53

import subProj_53.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_53")
    name = "subProj 53"

    buildType(subProj_bt_53_1)
    buildType(subProj_bt_53_0)
    buildType(subProj_bt_53_3)
    buildType(subProj_bt_53_2)
    buildType(subProj_bt_53_5)
    buildType(subProj_bt_53_4)
})
