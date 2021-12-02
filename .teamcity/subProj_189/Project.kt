package subProj_189

import subProj_189.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_189")
    name = "subProj 189"

    buildType(subProj_bt_189_1)
    buildType(subProj_bt_189_0)
    buildType(subProj_bt_189_3)
    buildType(subProj_bt_189_2)
    buildType(subProj_bt_189_5)
    buildType(subProj_bt_189_4)
})
