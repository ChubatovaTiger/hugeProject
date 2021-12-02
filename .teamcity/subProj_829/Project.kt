package subProj_829

import subProj_829.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_829")
    name = "subProj 829"

    buildType(subProj_bt_829_0)
    buildType(subProj_bt_829_2)
    buildType(subProj_bt_829_1)
    buildType(subProj_bt_829_4)
    buildType(subProj_bt_829_3)
    buildType(subProj_bt_829_5)
})
