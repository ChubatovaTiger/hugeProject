package subProj_1564

import subProj_1564.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1564")
    name = "subProj 1564"

    buildType(subProj_bt_1564_4)
    buildType(subProj_bt_1564_5)
    buildType(subProj_bt_1564_0)
    buildType(subProj_bt_1564_1)
    buildType(subProj_bt_1564_2)
    buildType(subProj_bt_1564_3)
})
