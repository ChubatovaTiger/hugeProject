package subProj_554

import subProj_554.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_554")
    name = "subProj 554"

    buildType(subProj_bt_554_0)
    buildType(subProj_bt_554_1)
    buildType(subProj_bt_554_2)
    buildType(subProj_bt_554_3)
    buildType(subProj_bt_554_4)
    buildType(subProj_bt_554_5)
})
