package subProj_227

import subProj_227.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_227")
    name = "subProj 227"

    buildType(subProj_bt_227_2)
    buildType(subProj_bt_227_1)
    buildType(subProj_bt_227_4)
    buildType(subProj_bt_227_3)
    buildType(subProj_bt_227_0)
    buildType(subProj_bt_227_5)
})
