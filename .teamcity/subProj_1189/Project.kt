package subProj_1189

import subProj_1189.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1189")
    name = "subProj 1189"

    buildType(subProj_bt_1189_5)
    buildType(subProj_bt_1189_1)
    buildType(subProj_bt_1189_2)
    buildType(subProj_bt_1189_3)
    buildType(subProj_bt_1189_4)
    buildType(subProj_bt_1189_0)
})
